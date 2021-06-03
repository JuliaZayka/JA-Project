package ua.lviv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.domain.Bucket;


public interface BucketRepository extends JpaRepository<Bucket, Integer>{
}